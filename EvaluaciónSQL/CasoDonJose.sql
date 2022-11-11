create schema if not exists minimarket;

create table `minimarket`. `proovedor` (
`proovedor_id` INT NOT NULL AUTO_INCREMENT,
`nombre` varchar(20) NOT NULL,
`rut` varchar (20) NOT NULL,
`correo` varchar (50) not null,
`direccion` varchar (30) not null,
PRIMARY KEY (`proovedor_id`));


create table `minimarket`. `Stock` (
`stock_id` INT NOT NULL AUTO_INCREMENT,
`cantidad` int NOT NULL,
`fecha` date NOT NULL,
PRIMARY KEY (`stock_id`));

alter table minimarket.stock add proovedor_id int not null;
alter table minimarket.stock add tipoProduct_id int not null;
alter table minimarket.stock add constraint stockProovedor foreign key (proovedor_id) references minimarket.proovedor(proovedor_id);
alter table minimarket.stock add constraint stockTipoProduct foreign key (tipoProduct_id) references minimarket.tipoProduct(tipoProduct_id);


create table `minimarket`. `tipoProduct` (
`tipoProduct_id` INT NOT NULL AUTO_INCREMENT,
`categoria` varchar(20) NOT NULL,
PRIMARY KEY (`tipoProduct_id`));


create table `minimarket`. `Producto` (
`producto_id` INT NOT NULL AUTO_INCREMENT,
`nombre` varchar(20) NOT NULL,
`precio` int  NOT NULL,
PRIMARY KEY (`producto_id`));

alter table minimarket.producto add tipoProduct_id int not null;
alter table minimarket.producto add constraint productoTipoProduct foreign key (tipoProduct_id) references minimarket.tipoProduct(tipoProduct_id);

create table `minimarket`. `inversion` (
`inversion_id` INT NOT NULL AUTO_INCREMENT,
`monto` int NOT NULL,
`fecha` date  NOT NULL,
PRIMARY KEY (`inversion_id`));


alter table minimarket.inversion add cantidad int not null;
alter table minimarket.inversion add producto_id int not null;
alter table minimarket.inversion add constraint inversionProducto foreign key (producto_id) references minimarket.producto(producto_id);


create table `minimarket`. `Venta` (
`venta_id` INT NOT NULL AUTO_INCREMENT,
`fecha` date NOT NULL,
`monto` int NOT NULL,
`cantidadProd` int not null,
PRIMARY KEY (`venta_id`));


alter table minimarket.venta add producto_id int not null;
alter table minimarket.venta add constraint ventaProducto foreign key (producto_id) references minimarket.producto(producto_id);


