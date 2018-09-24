insert into books (id_books, library_code, book_description, book_cost) values (1, 123456789, 'Как завоевать человечество', 666);
insert into readers (id_reader, reader_SNL, reader_address, reader_number) values (1, 'Роботов И.И', 'Ул. Выхина', 88005553535);
insert into booksdelivery (id_delivery, out_date, in_date, id_books, id_reader) values (1, '2018-09-24', '2018-10-30', 1, 1);