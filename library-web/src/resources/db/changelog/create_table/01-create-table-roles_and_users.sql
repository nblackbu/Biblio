create table roles_and_users (user_id bigint not null, role_id bigint not null);
GO

alter table if exists roles_and_users add constraint FKfhuv8j28xkv67h5t3ock5wyp2 foreign key (role_id) references roles;
GO

alter table if exists roles_and_users add constraint FKn1q6tt4vf2y0603q0fdvg6s97 foreign key (user_id) references users;
GO