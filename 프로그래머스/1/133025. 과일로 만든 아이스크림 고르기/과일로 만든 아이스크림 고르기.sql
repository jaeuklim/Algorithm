-- 코드를 입력하세요
SELECT FIRST_HALF.FLAVOR
FROM FIRST_HALF, ICECREAM_INFO
WHERE FIRST_HALF.FLAVOR = ICECREAM_INFO.FLAVOR AND FIRST_HALF.TOTAL_ORDER > 3000 AND INGREDIENT_TYPE = "fruit_based"