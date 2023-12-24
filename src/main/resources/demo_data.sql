insert into users(name, username, password)
values('John Doe', 'john@gmail.com', '$2a$10$eYGJBOz2kg70hTYKmifYiuwoUOUaRkDi06rkat.k2QcrTy3JetLGm'),
      ('Mike Sain', 'mike@gmail.com', '$2a$10$eYGJBOz2kg70hTYKmifYiuwoUOUaRkDi06rkat.k2QcrTy3JetLGm');

insert into tasks(title, description, status, expiration_date)
values('Buy cheese', 'null', 'TODO', '2023-01-29 12:00:00'),
      ('Do homework', 'Math, Phisics', 'IN_PROCESS', '2023-01-29 12:00:00'),
      ('Clean romes', 'null', 'DONE', '2023-01-29 12:00:00'),
      ('Call Mike', 'Ask about meetings', 'TODO', '2023-01-29 12:00:00');

insert into users_tasks(task_id, user_id)
values(1, 2),
      (2, 2),
      (3, 2),
      (4, 1);

insert into users_roles(user_id, role)
values(1, 'ROLE_ADMIN'),
      (1, 'ROLE_USER'),
      (2, 'ROLE_USER');