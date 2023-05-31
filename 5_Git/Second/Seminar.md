Seminar 1
###########################################################################################################################

Commands:
- git status
- git log
- git push -u origin main (связываем локальную и удаленную ветку)
- git remote -v (показывает все удаленные источники нашего локального репозитория)
- git remote show origin
- git remote remove origin (удаляет связи с удаленным репозиториаем)
- git remote add origin_1 "ссылка" (подключает удаленный репозиторий к локальному. можно несколько репозиториев привязать)
- git remote add origin_2 "ссылка" (подключает удаленный репозиторий к локальному. можно несколько репозиториев привязать)
- git push origin_1 main
- git push origin_2 main
- git fetch --all (скачать изменения из всех репозиториев, но не записывает в локальный репозиторий)

- git log origin_1/main ^main
- git log origin_2/main ^main

- git merge origin_1/main
- git merge origin_2/main

- git push origin_1/main
- git push origin_2/main

Вопросы:
- чем отличается merge от rebase
- что такое git revert и для чего он нужен
- как в git выгрузить изменения в несколько источников причем разные 


Seminar 2
###########################################################################################################################


git remote -v
git remote remove
git remote add
git branch -M main
git push -u origin main

git log 
git diff hash1 hash2

git blame [название файла]  #кто и когда сделал коммит
git checkout
git revert hash

.gitignore 



