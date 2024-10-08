-- 코드를 작성해주세요
SELECT SUM(SCORE) AS SCORE, HR_GRADE.EMP_NO, EMP_NAME, POSITION, EMAIL
FROM HR_GRADE JOIN HR_EMPLOYEES ON HR_EMPLOYEES.EMP_NO = HR_GRADE.EMP_NO
GROUP BY HR_GRADE.EMP_NO, YEAR
HAVING HR_GRADE.YEAR = 2022
ORDER BY SCORE DESC
LIMIT 1