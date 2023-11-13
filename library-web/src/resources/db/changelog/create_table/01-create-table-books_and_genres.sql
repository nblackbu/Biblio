create table books_and_genres (book_id bigint not null, genre_id bigint not null);
GO

alter table if exists books_and_genres add constraint FKdx8n5cefjqmoos22hil9su2q6 foreign key (genre_id) references genres;
GO

alter table if exists books_and_genres add constraint FKjqymx7ybxhekk0ojir3u1cgou foreign key (book_id) references books;
GO