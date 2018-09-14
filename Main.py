class Student():
	def  __init__(self,name, age, course, hobbi):
		self.name = name
		self.age = age
		self.course = course
		self.hobbi = hobbi

	def __str__(self):
		return "Name: {}{}Age: {}{}Course: {}{}Hobbi: {}".format(self.name,'\n',str(self.age),'\n',str(self.course),'\n',self.hobbi)

def Main():
	student = Student("Diana",18,2,"Programming")
	print(student)

Main()
