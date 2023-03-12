create table books_and_users (user_id bigint not null, books_id bigint not null);
GO

alter table if exists books_and_users add constraint FKj7g1ohi4837bo41t4txewx0kx foreign key (books_id) references books;
GO

alter table if exists books_and_users add constraint FKejc1urxlba8n8xan47mgshgqa foreign key (user_id) references users;
GO