use T2007E_java2;

select * from sinhvien;

select * from lophoc;

create table lophoc(
	class_code varchar(20) primary key,
	class_name nvarchar(100),
	class_description nvarchar(500),
	start_date datetime
);

create proc pr_themSv(
	@id int,
	@name nvarchar(100),
	@classcode varchar(20),
	@errorcode int out,
	@errordesc nvarchar(500) out
) as
begin
	-- 1. kiem tra id ton tai hay khong?
	declare @count int;
	set @count = (select count(*) from sinhvien where id = @id);
	if @count > 0 
	begin
		set @errorcode = 1;
		set @errordesc = N'Id sinh viên đã tồn tại.';
	end;
	else
	begin
		-- 2: kiem tra classcode da ton tai hay chua?
		set @count = (select count(*) from lophoc where class_code = @classcode);
		if @count = 0 
		begin
			-- lop hoc chua ton tai
			-- 3. them lop hoc
			insert into lophoc(class_code, class_name, class_description, start_date) 
			values (@classcode, @classcode, @classcode, getdate());
		end;

		-- 4. them sinh vien
		insert into sinhvien(id, name, classcode) values (@id, @name, @classcode);
		set @errorcode = 0;
		set @errordesc = N'Thêm mới sinh viên thành công.';
	end;
end;


-- chay procedure
begin
declare @code int;
declare @desc nvarchar(500);
exec dbo.pr_themSv 5, N'Hoàng Thị Tèo', 'T2007E', @code out, @desc out;
print concat('Code: ', @code);
print 'Desc: '+ @desc;
end;

