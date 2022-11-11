insert into minimarket.tipoProduct (categoria) values ('snack');
insert into minimarket.tipoProduct (categoria) values ('frutas');
insert into minimarket.tipoProduct (categoria) values ('abarrotes');
insert into minimarket.tipoProduct (categoria) values ('articulos personales');

insert into minimarket.producto (producto_id, nombre, precio, tipoProduct_id) values (1, 'papas fritas', 2000, 1);
insert into minimarket.producto (producto_id, nombre, precio, tipoProduct_id) values (2, 'papel higiénico', 1000, 4);
insert into minimarket.producto (producto_id, nombre, precio, tipoProduct_id) values (3, 'lentejas', 1500, 3);
insert into minimarket.producto (producto_id, nombre, precio, tipoProduct_id) values (4, 'tallarines', 1500, 3);
insert into minimarket.producto (producto_id, nombre, precio, tipoProduct_id) values (5, 'kilo manzana', 1000, 2);

select * from minimarket.productos;

insert into minimarket.venta (venta_id, fecha, monto, cantidadProd, producto_id) values (1, '2019-11-11', 3000, 3, 5);
insert into minimarket.venta (venta_id, fecha, monto, cantidadProd, producto_id) values (2, '2020-11-11', 10000, 5, 1);

select * from minimarket.venta; 

