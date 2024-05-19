-- 코드를 입력하세요
SELECT count(*) as USERS
from user_info
where JOINED like "2021%" and Age >= 20 and Age < 30;