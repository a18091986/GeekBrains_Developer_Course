Добрый день!
1) Для .our-brand-text сделать только margin-left: 60px; отступ снизу не нужен.
2) У .our-brand-demo оставить
display: grid;
grid-template-columns: repeat(2, 1fr);
align-items: center;
Все остальные свойства ничего не дают)
3) У .absolute-central можно убрать margin, они там не нужны, так как идет абсолютное позиционирование
4) У кнопки btn-all-product лучше убрать width и height, добавить padding: 15px 39px

Все остальное великолепно!

Можете пока проработать наведение на элементы (hover добавить) https://www.figma.com/file/mnLY69cYE5cqWM5w6n5hXx/Seo-%26-Digital-Marketing-Landing-Page?node-id=227%3A2&mode=dev
Иконки в headere нужно будет отдельно вставлять и при наведении на 3 полоски (бургер), должно появиться меню в фиксированном положении.