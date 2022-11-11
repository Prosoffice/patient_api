DROP TABLE IF EXISTS Patient;

CREATE TABLE Patient
(
    id int not null primary key,
    Name char(40) not null,
    Address char(40) not null,
    DateOfBirth date not null,
    ConditionId integer,
    ConsultantId integer,
    foreign key (ConditionId) references MedicalCondition(id),
    foreign key (ConsultantId) references Consultant(id)
);

insert into Patient(id, Name, Address, DateOfBirth, ConditionId, ConsultantId)
values (1, 'Graham Mansfield', 'Stafford Court', '1989-09-21', 2, 1);
insert into Patient(id, Name, Address, DateOfBirth, ConditionId, ConsultantId)
values (2, 'Fred Pratt', 'Stafford Court', '1985-10-22', 3, 2);
insert into Patient(id, Name, Address, DateOfBirth, ConditionId, ConsultantId)
values (3, 'Nick Dyson', 'Stafford Court', '1986-01-07', 1, 1);
insert into Patient(id, Name, Address, DateOfBirth, ConditionId, ConsultantId)
values (4, 'Josiah Wedgewood', 'The Kiln', '1982-03-12', 1, 1);
insert into Patient(id, Name, Address, DateOfBirth, ConditionId, ConsultantId)
values (5, 'Jorge Stephenson', 'The Rocket', '1976-06-17', 3, 2);

