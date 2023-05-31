    1  history
    2  file1 >> file1
    3  echo file1 >> file1
    4  echo file2 >> file2
    5  cat file1
    6  cat file2
    7  cat file1 file 2
    8  cat file1 file2
    9  cat file1 file2 >> file3
   10  cat file3
   11  mv file3 fil3rename
   12  touch f1 f2 f3
   13  mkdid test_dir
   14  mkdir test_dir
   15  mv f* test_dir/
   16  ll test_dir/
   17  rm -r test_dir/
   18  ll
   19  echo file1 >> file1
   20  cp file1 file2
   21  ln -s file1 file3
   22  ll
   23  ln file4 file1
   24  ln file1 file4
   25  ls -li
   26  rm file1
   27  ls -li
   28  cat file2 file3 file4
   29  mv file2 file22
   30  mv file3 file33
   31  mv file4 file44
   32  ls -li
   33  ln -s file22 file22_sym
   34  mkdir for_sym_links
   35  mv file22_sym for_sym_links/
   36  cat for_sym_links/file22_sym 
   37  cat file22 
   38  mkdir for_hard_links
   39  ln file22 file22_hard_link
   40  mv file22_hard_link for_hard_links
   41  cat for_hard_links/file22_hard_link 
   42  history >> HW_2.txt
