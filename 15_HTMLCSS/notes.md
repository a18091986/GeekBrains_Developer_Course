# Расширения:
- CSS Formatter
- Prettier
- Auto Rename Tag ()
- CSS Peek (поиск селекторов CSS)


# Настройка IDE
- автосохранение
- автоформатирование файлов
cntrl + , -> format on save
cntrl + , -> word wrap


# горячие клавиши 
- структура - ! -> Tab
- вводим название тега -> tab
- lorem150 -> Tab
- p*3
- link:css
- .text - div class="text"
- h1.title
- .item.item$*6 





# селекторы
- id (#id_name)
- tag (tag)
- class (.class_name)

# единицы измерения
- относительные (px, %, em - высота текущего шрифта (высота строчки))
- абсолютные ()

# макет

# строчные и блочные элементы
div - блочный элемент
- отображаются в виде прямоугольников
- занимают всю доступную ширину
- высота определяется содержимым
- начинаются с новой строки
- допускается добавлять один блочный внутри другого
- запрещается добавлять блочный внутрь строчного
span, a, i, strong - строчный элепмент
- 

* {
    margin: 0;
    padding: 0;
}



# значения свойства display
- none (скрыть)
- block (блочный)
- inline (строчный)
- inline-block (строчно-блочный)
- flex (гибкий) - наделение контейнера способностью изменять ширину или высоту для поддержки всех видов дисплеев и разных разрешений экранов
-- сжимаем и растягиваем
-- выравнивание по вертикали и по горизонтали
-- элементы могут выстраиваться в несколько строк
-- возможность формирования блока справа налево
-- main axis, cross axis, main-start, main-end, main size, cross size, cross-start, cross-end

justify-content: flex-start, justify-content: flex-end, justify-content: center, justify-content: space-between, justify-content: space-around
align-items: stretch, align-items: center, align-items: flex-start, align-items: flex-end, align-items: baseline

- grid layout (сетка)

-- распределение элементов не только горизонтально, но и вертикально
-- объединеине ячеек
-- гибкая адаптивная сетка
-- поддержка браузеров

-- grid lines
-- grid track - пространство между двумя соседними линиями сетки
-- grid cell - пространство ограниченное четырьмя линиями сетки
-- grid items - элементы, которые назначаются областям сетки

-- grid-template-columns
-- grid-template-rows
-- gap
px, %, fr (fraction - равные части), auto

repeat(5, 200px)

# значения свойства position

- точно определяет позицию блока относительно окна

-- static
-- relative
-- absolute
-- fixed
-- inherit

# иконки
- https://fontawesome.com/icons/vk?f=brands&s=solid&an=shake

# онлайн-тренажер
- flexbox froggy
- grid garden

# свободно распространяемые картинки
- https://www.freepik.com/search?format=search&orientation=portrait&query=student

