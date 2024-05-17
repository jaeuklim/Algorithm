-- 코드를 입력하세요
SELECT DR_NAME, Dr_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
From doctor
Where MCDP_CD = "CS" OR MCDP_CD = "GS"
Order by HIRE_YMD desc, DR_NAME