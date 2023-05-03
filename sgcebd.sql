create table folha(
nomeFolha varchar(100),
departamento varchar(100),
salarioBruto double,
valeTransporte double,
INSS double,
IRPF double,
totalDescontos double,
salarioLiquido double
);

insert into folha(nomeFolha,departamento,salarioBruto,valeTransporte,INSS,IRPF,totalDescontos,salarioLiquido)values("João","Ti",1000,10,20,111,20,111);


select * from folha;

select * from backups;

select * from pessoa;

insert into backups (select nome from sgce.pessoa,horario,tipoBackup);

select A.nome,B.horario,B.tipoBackup from pessoa A, backups B where A.nome = B.nomeBackup;

insert into backups(horario,tipoBackup,nomeBackup)values("11:20","Backup Geral","João");