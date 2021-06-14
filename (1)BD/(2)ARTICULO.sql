use SysVentasCompras;
##################################################################################
#####################################FUNCION######################################
-- ----------------------------ESTADO DE PRODUCTOS--------------------------------
drop function if exists fn_estado;
delimiter $$
create function fn_estado(pstock_total  int,pstock_minimo int)
returns varchar (50)
begin 
declare estado varchar (50);

if (pstock_total < pstock_minimo+1)then 
set estado='Estado insuficiente';
else
set estado='Estado suficiente';
end if;
return estado;
END $$
DELIMITER ;
##################################################################################
###############################PROCEDIMIENTO######################################
-- --------------------------------LISTAR-----------------------------------------
drop procedure if exists usp_listar_art;
delimiter $$
create procedure usp_listar_art(pnombre varchar(100))
begin
	select a.*, t.nombre_tienda as nom_tienda
    from articulo a inner join tienda t
    on a.idtienda=t.idtienda
    where 
    a.nombre like concat(pnombre,'%') or
	a.codigo like concat(pnombre,'%') or
    t.nombre_tienda like concat(pnombre,'%') 
    order by idarticulo;
END $$
DELIMITER ;
call usp_listar_art('');
##################################################################################
###############################PROCEDIMIENTO######################################
-- -----------------------------------INSERTAR------------------------------------
drop procedure if exists usp_insertar_art;
delimiter $$
create procedure usp_insertar_art(
pcodigo varchar(10), 
pnombre varchar(45),
pdescripcion varchar(200), 
pcategoria VARCHAR(45),
punidad VARCHAR(45),
pstock_total decimal(10,2),
pstock_minimo decimal(10,2),
pidtienda int)

begin

     -- DECLARAR VARIABLES 
     declare mensaje text;
     declare mensaje_oficial text;
     declare codError int;
     declare estado varchar (50);
     
     set estado=fn_estado(pstock_total,pstock_minimo);
		if exists(select idtienda from tienda where idtienda=pidtienda)then
			if not exists(select codigo from articulo where codigo=pcodigo)then
				insert into articulo
				values(null,
						pcodigo, 
						pnombre, 
						pdescripcion,
						pcategoria,
						punidad,
						pstock_total,
                        pstock_minimo,
						pidtienda);
					set mensaje='Se inserto corectamente';
					set codError=1;
					set mensaje_oficial=mensaje;
            else
			set mensaje='El codigo del articulo ya existe ';
			set codError=0;
			set mensaje_oficial=mensaje;
			end if;
		else
			set mensaje='El id de la tienda no existe ';
			set codError=0;
			set mensaje_oficial=mensaje;
		end if;
select codError,mensaje_oficial;
insert into historial values(CURDATE(),CURTIME(), 'Articulo Registrado');

END $$
DELIMITER ;
##################################################################################
###################################PROCEDIMIENTO##################################
-- ----------------------------------MODIFICAR------------------------------------
drop procedure if exists usp_modificar_art;
delimiter $$
create procedure usp_modificar_art(
pcodigo VARchar(10), 
pnombre varchar(45),
pdescripcion varchar(200), 
pcategoria VARCHAR(45),
punidad VARCHAR(45),
pstock_total decimal(10,2),
pstock_minimo decimal(10,2),
pidtienda int)
begin

     -- DECLAR VARIABLES 
     declare codError int;
     declare mensaje text;
     declare mensaje_oficial text;
	 declare pestado varchar (50);
     
     set pestado=fn_estado(pstock_total,pstock_minimo);

		if exists (select idarticulo from articulo where idarticulo=pidarticulo)then
			if exists(select idtienda from tienda where idtienda=pidtienda)
		then
			update articulo
			set 
				codigo=pcodigo, 
				nombre=pnombre, 
				descripcion=pdescripcion,
                categoria=pcategoria,
				unidad=punidad,
				stock_total=pstock_total, 
				stock_minimo=pstock_minimo,
				idtienda=pidtienda
			where idarticulo=pidarticulo;
			set mensaje='Se modifico corectamente';
			set codError=0;
			set mensaje_oficial=mensaje;
			else 
				set mensaje='El id del Tienda no existe ';
				set codError=1;
				set mensaje_oficial=mensaje;
			end if;
		else 
			set mensaje='El id no existe';
			set codError=1;
			set mensaje_oficial=mensaje;
		end if;
select codError,mensaje_oficial;
END $$
DELIMITER ;
##################################################################################
###################################PROCEDIMIENTO##################################
-- ----------------------------------ELIMINAR-------------------------------------
drop procedure if exists usp_eliminar_art;
delimiter $$
create procedure usp_eliminar_art(pidarticulo int)
begin
 --   declarar variables 
     declare codError int;
     declare mensaje varchar (50);
     declare mensaje_oficial varchar (50);

	if exists (select idarticulo from articulo where idarticulo=pidarticulo )then
		if not exists (select idarticulo from detalle_venta where idarticulo=pidarticulo)then
			if not exists (select idarticulo from detalle_compra where idarticulo=pidarticulo)then
		delete from articulo
		where idarticulo=pidarticulo;
		set codError =0;
		set mensaje ='Se elimino corectamente';
		set mensaje_oficial=mensaje;
			else 
				set codError =1;
				set mensaje ='El ID ya existe en otras tablas (TABLA DE COMPRAS)';
				set mensaje_oficial=mensaje;
			end if;
		else 
			set codError =1;
			set mensaje ='El ID ya existe en otras tablas (TABLA DE VENTAS)';
			set mensaje_oficial=mensaje;
		end if;
	end if;
select codError,mensaje_oficial;
END $$
DELIMITER ;
call usp_eliminar_art(3);

###################################PROCEDIMIENTO##################################
-- --------------------------BUSCAR POR NOMBRE------------------------------------
DROP PROCEDURE IF EXISTS usp_listar_articulo_x_nombre;
DELIMITER $$
CREATE PROCEDURE usp_listar_articulo_x_nombre(buscar varchar(45))
BEGIN 
select a.*, t.nombre_tienda as nom_tienda
from articulo a inner join tienda t
on a.idtienda=t.idtienda
where a.nombre LIKE CONCAT(buscar ,'%')
order by idarticulo asc;

END $$
DELIMITER ;
call usp_listar_articulo_x_nombre('ar');

SELECT * FROM articulo WHERE nombre LIKE '%ar%';
##################################################################################
###################################PROCEDIMIENTO##################################
-- ---------------------------BUSCAR POR CODIGO-----------------------------------
DROP PROCEDURE IF EXISTS usp_listar_articulo_x_codigo;
DELIMITER $$
CREATE PROCEDURE usp_listar_articulo_x_codigo(buscar varchar(45))
BEGIN 
select a.*, t.nombre_tienda as nom_tienda
from articulo a inner join tienda t
on a.idtienda=t.idtienda
where a.codigo LIKE CONCAT(buscar ,'%')
order by idarticulo asc;

END $$
DELIMITER ;
call usp_listar_articulo_x_codigo(1);
##################################################################################
###################################PROCEDIMIENTO##################################
-- ---------------------------BUSCAR POR TIENDA-----------------------------------
DROP PROCEDURE IF EXISTS usp_listar_articulo_x_tienda;
DELIMITER $$
CREATE PROCEDURE usp_listar_articulo_x_tienda(buscar varchar(45))
BEGIN 
select a.*, t.nombre_tienda as nom_tienda
from articulo a inner join tienda t
on a.idtienda=t.idtienda
where T.nombre_tienda LIKE CONCAT(buscar ,'%')
order by idarticulo asc;

END $$
DELIMITER ;
call usp_listar_articulo_x_tienda('TIENDA 1');

SELECT * FROM articulo;

call usp_insertar_art('A00001', 'ARTICULO 1', 'DESCRIPCION 1', 'LIMPIEZA','LITRO', 100.00, 3.00,1);
call usp_insertar_art('A00002', 'ARTICULO 2', 'DESCRIPCION 2', 'COMIDA','KL', 200.00, 10.00,2);
call usp_insertar_art('A00003', 'ARTICULO 3', 'DESCRIPCION 3', 'LIMPIEZA','LITRO', 100.00, 3.00,1);