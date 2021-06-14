use SysVentasCompras;
##################################################################################
###############################PROCEDIMIENTO######################################
-- --------------------------------LISTAR-----------------------------------------
drop PROCEDURE IF EXISTS usp_listar_tienda;
DELIMITER $$
CREATE PROCEDURE usp_listar_tienda(pnombre_tienda varchar(20))
BEGIN
select * from tienda
where nombre_tienda like concat('%',pnombre_tienda,'%') OR
 codigo like concat('%',pnombre_tienda,'%') OR
 telefono like concat('%',pnombre_tienda,'%') 

order by idtienda;

END $$
DELIMITER ;
##################################################################################
###############################PROCEDIMIENTO######################################
-- -----------------------------------INSERTAR------------------------------------
drop procedure if exists usp_insertar_tienda;
delimiter $$
create procedure usp_insertar_tienda(
pcodigo char(7),
pnombre_tienda varchar(45), 
pubicacion varchar(45), 
pcontacto varchar(45), 
ptelefono varchar(45))
begin

     -- DECLARAR VARIABLES 
     declare mensaje text;
     declare mensaje_oficial text;
     declare codError int;
     declare estado varchar (50);

     set estado='ACTIVO';
		if not exists(select codigo from tienda where codigo=pcodigo)then
		insert into tienda
		values (null,pcodigo,pnombre_tienda,pubicacion,pcontacto,ptelefono);
			set mensaje='Se inserto corectamente';
			set codError=1;
			set mensaje_oficial=mensaje;
		else
			set mensaje='El codigo de la tienda ya existe ';
			set codError=0;
			set mensaje_oficial=mensaje;
		end if;
select codError,mensaje_oficial;
insert into historial values(CURDATE(),CURTIME(), 'Tienda Registrada');

END $$
DELIMITER ;
##################################################################################
###################################PROCEDIMIENTO##################################
-- ----------------------------------MODIFICAR------------------------------------
drop procedure if exists usp_modificar_tienda;
delimiter $$
create procedure usp_modificar_tienda(
pidtienda int, 
pcodigo char(6),
pnnombre_tienda varchar(45),
pubicacion varchar(45), 
pcontacto varchar(45), 
ptelefono varchar(45))
begin

     -- DECLAR VARIABLES 
     declare codError int;
     declare mensaje text;
     declare mensaje_oficial text;
	 declare pestado varchar (50);
     
     set pestado='ACTIVO';

	if exists(select idtienda from tienda where idtienda=pidtienda)
		then
		update tienda
		set 
        codigo=pcodigo,
        nombre_tienda=pnombre_tienda, 
		contacto=pcontacto,
		telefono=ptelefono
		where idtienda=pidtienda;
		set mensaje='Se modifico corectamente';
		set codError=0;
		set mensaje_oficial=mensaje;
	else 
		set mensaje='El id del Tienda no existe ';
		set codError=1;
		set mensaje_oficial=mensaje;
	end if;
select codError,mensaje_oficial;
END $$
DELIMITER ;

##################################################################################
###################################PROCEDIMIENTO##################################
-- ----------------------------------ELIMINAR-------------------------------------
drop procedure if exists usp_eliminar_tienda;
delimiter $$
create procedure usp_eliminar_tienda(pidtienda int)
begin
 --   declarar variables 
     declare codError int;
     declare mensaje varchar (50);
     declare mensaje_oficial varchar (50);

	if exists (select idtienda from tienda where idtienda=pidtienda )then
		if not exists (select idtienda from articulo where idtienda=pidtienda)then
		delete from tienda
		where idtienda=pidtienda;
		set codError =0;
		set mensaje ='Se elimino corectamente';
		set mensaje_oficial=mensaje;
			else 
				set codError =1;
				set mensaje ='El ID ya existe en otras tablas (TABLA DE ARTICULOS)';
				set mensaje_oficial=mensaje;
			end if;
	end if;
select codError,mensaje_oficial;
END $$
DELIMITER ;
##################################################################################
###################################PROCEDIMIENTO##################################
-- ---------------------------BUSCAR POR TIENDA-----------------------------------
DROP PROCEDURE IF EXISTS usp_listar_tienda_x_tienda;
DELIMITER $$
CREATE PROCEDURE usp_listar_tienda_x_tienda(buscar varchar(45))
BEGIN 
select * 
from  tienda
where nombre_tienda LIKE CONCAT(buscar ,'%')
order by idtienda asc;

END $$
DELIMITER ;
call usp_listar_tienda_x_tienda('TIENDA 1');
##################################################################################
###################################PROCEDIMIENTO##################################
-- ---------------------------BUSCAR POR TIENDA-----------------------------------
DROP PROCEDURE IF EXISTS usp_listar_tienda_x_codigo;
DELIMITER $$
CREATE PROCEDURE usp_listar_tienda_x_codigo(buscar varchar(45))
BEGIN 
select * 
from  tienda
where codigo LIKE CONCAT(buscar ,'%')
order by idtienda asc;

END $$
DELIMITER ;
call usp_listar_tienda_x_codigo('TIENDA 1');


call usp_insertar_tienda('0001','TIENDA 1','TIENDA DORITOS', 'BELEN', '896545');
call usp_insertar_tienda('0002','TIENDA 2','TIENDA DORITOS', 'BELEN', '896545');
call usp_insertar_tienda('0003','TIENDA 3','TIENDA DORITOS', 'BELEN', '896545');
call usp_listar_tienda('');