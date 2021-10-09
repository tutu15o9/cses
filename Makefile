cpp:
	g++ ${dir}sol.cpp -o ${dir}sol.out -w && ${dir}sol.out < ${dir}in.txt > ${dir}out.txt
java:
	javac ${dir}sol.java -d ${dir} -nowarn && java -cp ${dir} sol < ${dir}in.txt > ${dir}out.txt
new:
	mkdir ${dir}
	cp sol.cpp sol.java ${dir}
	touch ${dir}in.txt ${dir}out.txt
clean:
	find . -name '*.class' -exec rm -f {} \;
	find . -name '*.out' -exec rm -f {} \;
del:
	rm -r ${dir}
	
