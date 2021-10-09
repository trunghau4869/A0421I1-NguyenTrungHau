use quanlysinhvien1;
select * from subject
order by credit desc
limit 1;

select * from subject
join mark
order by mark desc
limit 1;

-- select * from  mark
select student.studentName , max(m.mark) as max from student 
join mark as m on student.studentId=m.studentId
group by m.studentID 
order by m.mark asc




