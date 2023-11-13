alter table if exists reviews add constraint FK6a9k6xvev80se5rreqvuqr7f9 foreign key (book_id) references books;
GO

alter table if exists reviews add constraint FKcgy7qjc1r99dp117y9en6lxye foreign key (user_id) references users;
GO

drop table reviews;
GO