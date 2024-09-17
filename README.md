# adventureGame

to compile via terminal:
  1. Navigate the root directory of the project
  2. javac -d out -sourcepath . **/*.java
     -> -d out means, all compiled ".class" files will be placed in the out directory
     -> -sourcepath . **/*.java means, all the files are located in the current directory and subdirectories
  3. to Run: java -cp out play.Main
     -> cp out: Let JVM look for the compiled classes inside "out" directory
