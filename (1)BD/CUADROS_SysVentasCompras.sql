DROP DATABASE IF exists SysVentasCompras;
CREATE DATABASE SysVentasCompras;
use SysVentasCompras;

DROP TABLE IF exists tienda;
CREATE TABLE 
tienda (
idtienda INT auto_increment primary key,
codigo varchar(10),
nombre_tienda VARCHAR(45),
ubicacion VARCHAR(250),
contacto VARCHAR(45),
telefono  VARCHAR(45));

DROP TABLE IF exists articulo;
CREATE TABLE 
articulo(
idarticulo INT auto_increment primary key,
codigo varchar(10),
nombre VARCHAR(45),
descripcion VARCHAR(200),
categoria VARCHAR(45),
unidad VARCHAR(45),
stock_total decimal(10,2),
stock_minimo decimal(10,2),
idtienda INT,
foreign key (idtienda) references 
tienda (idtienda));

CREATE TABLE 
cliente(
idcliente INT auto_increment primary key,
nombre VARCHAR(45),
apellidos VARCHAR(45),
genero VARCHAR(10),
fecha_nacimiento date, 
tipo_documento VARCHAR(45),
num_documento VARCHAR(45),
direccion VARCHAR(100),
telefono VARCHAR(45),
email VARCHAR(45));

CREATE TABLE 
trabajador(
idtrabajador INT auto_increment primary key,
nombre varchar(45),
apellidos VARCHAR(45),
genero varchar(45), 
fecha_nacimiento date, 
tipo_documento VARCHAR(45),
num_documento VARCHAR(45),
telefono VARCHAR(45),
email VARCHAR(45),
usuario varchar(45), 
password varchar(45),
cargo varchar(45));

CREATE TABLE 
proveedor(
idproveedor int auto_increment primary key, 
razon_social varchar(45),
ruc varchar(45), 
representante varchar(500),
direccion varchar(100),
telefono varchar(45), 
email varchar(45),
url varchar(45));

CREATE table
lote(
idlote INT auto_increment primary key,
idarticulo int,
fecha_vencimiento date,
estado_lote varchar(45),
foreign key (idarticulo) references 
articulo (idarticulo));

CREATE table
pago(
idpago INT auto_increment primary key,
forma_pago varchar(45),
monto_total decimal(10,2)
);

CREATE TABLE 
compra(	
idcompra INT auto_increment primary key,
fecha_compra DATE,
tipo_comprobante VARCHAR(45),
serie VARCHAR(45),
correlativo VARCHAR(45),
igv DECIMAL(7,2),
estado VARCHAR(45),
idproveedor INT,
idtrabajador INT,
idpago int,
foreign key (idproveedor) references 
proveedor (idproveedor),
foreign key (idpago) references 
pago (idpago),
foreign key (idtrabajador) references 
trabajador (idtrabajador));

CREATE TABLE 
detalle_compra (
iddetalle_compra INT auto_increment primary key,
precio_compra DECIMAL(7,2),
cantidad_compra int (11),
idlote INT,
idarticulo INT,
idcompra INT,
foreign key (idarticulo) references 
articulo (idarticulo),
foreign key (idcompra) references 
compra (idcompra),
foreign key (idlote) references 
lote (idlote));

CREATE TABLE 
venta(
idventa INT auto_increment primary key,
fecha_venta DATE, 
tipo_comprobante VARCHAR(45),
serie VARCHAR(4),
correlativo VARCHAR(7),
igv DECIMAL(7,2),
estado VARCHAR(45),
idcliente INT,
idtrabajador INT,
idpago int,
foreign key (idcliente) references 
cliente (idcliente),
foreign key (idpago) references 
pago (idpago),
foreign key (idtrabajador) references 
trabajador (idtrabajador));

CREATE TABLE 
detalle_venta(
iddetalle_venta INT auto_increment primary key,
precio_venta DECIMAL(10,2),
cantidad_venta INT,
descuento DECIMAL(10,2),
idlote INT,
idarticulo INT,
idventa int,
foreign key (idventa) references 
venta (idventa),
foreign key (idarticulo) references 
articulo (idarticulo),
foreign key (idlote) references 
lote (idlote));

CREATE TABLE 
historial
(fecha date,
hora time,
descripcion varchar(100));
