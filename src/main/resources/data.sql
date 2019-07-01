use shopping;

insert into category(id, name) values
(1, '상의(남)'), (2, '하의(남)'),
(3, '상의(여)'), (4, '하의(여)'),
(5, '구두'), (6, '가방'), (7, '소품');

insert into subcategory(categoryId, name) values
(1, '티셔츠/셔츠'), (1, '맨투맨/후드티'),
(2, '청바지/바지'), (2, '트레이닝복'),
(3, '티셔츠/셔츠'), (3, '맨투맨/후드티'),
(4, '청바지/바지'), (4, '트레이닝복'), (4, '스커트'),
(5, '샌들/쪼리'), (5, '하이힐/정장 구두'), (5, '단화/운동화'),
(6, '백팩'), (6, '사무용/서류가방'), (6, '크로스백/클러치백'),
(7, '시계'), (7, '벨트'), (7, '귀걸이/반지/목걸이'), (7, '지갑');

insert into product(categoryId, subId, name, content, price, filename, filepath) values
(6,13, '무지 백팩', '심플한 백팩!', '14000원', 'bag.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\bag.jpg'),
(7,17, '벨트', '유니크한 벨트', '9900원', 'belt.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\belt.jpg'),
(7,17, '하트 벨트', '러블리한 벨트', '9900원', 'belt1.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\belt1.jpg'),
(7,18, '팔찌', '팔찌 3종 세트', '14000원', 'bracelet.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\bracelet.jpg'),
(7,18, '귀걸이', '다양한 종류 귀걸이', '5000원', 'earring.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\earring.jpg'),
(6,15, '에코백', '러블리한 디자인', '10000원', 'ecobag.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\ecobag.jpg'),
(2,3, '슬렉스', '자연스러운 핏', '27000원', 'men_bottoms.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\men_bottoms.jpg'),
(2,4, '트레이닝복 2종', '긴바지와 반바지 2종', '29000원', 'men_bottoms_training.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\men_bottoms_training.jpg'),
(2,4, '트레이닝복', '유니크한 디자인', '19000원', 'men_bottoms_training1.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\men_bottoms_training1.jpg'),
(7,18, '목걸이', '유행하는 실버 목걸이', '13000원', 'necklace.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\necklace.jpg'),
(5,12, '화이트 운동화', '깔끔한 화이트 색', '29000원', 'shoes.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\shoes.jpg'),
(5,12, '블랙 운동화', '심플한 블랙 디자인', '27000원', 'shoes1.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\shoes1.jpg'),
(3,6, '여성 후드티', '자수 후드티', '27000원', 'women_hoodies.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\women_hoodies.jpg'),
(3,5, '여성 반팔티', '뒷면 프린팅 반팔', '12000원', 'women_short.jpg', 'C:\Users\JEJ\IdeaProjects\shopping\shopping_back\shopping\women_short.jpg');
