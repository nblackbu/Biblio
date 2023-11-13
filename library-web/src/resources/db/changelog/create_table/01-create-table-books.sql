create table books (id bigserial not null, authors_lastname varchar(255), authors_name varchar(255), authors_surname varchar(255), book_name varchar(255), publishing_year integer not null, quantity integer not null, author_id bigint, primary key (id));

GO

alter table if exists books add constraint FKfjixh2vym2cvfj3ufxj91jem7 foreign key (author_id) references authors