alter table if exists books add constraint FKfjixh2vym2cvfj3ufxj91jem7 foreign key (author_id) references authors;
GO

drop table books;
GO