# Building a Python GUI, with one Button that Has a counter for everytime you click it. 

import tkinter as tk

counter = 0
# Function to add one to the counter
def count():
    global counter
    counter += 1
    label.config(text=str(counter))

def count_reset():
    global counter
    counter = 0
    label.config(text=str(counter))

# Building GUI
m = tk.Tk()
m.geometry("250x170")
m.title('Button Counter')
m.configure(bg='blue')

# Building Counter Label
label = tk.Label(m, fg="green")
label.pack()

#Building Button 
button = tk.Button(m, text = 'Press me', width=25, command=count)
button.pack()

button2 = tk.Button(m, text = 'Reset Count', width=25, command=count_reset)
button2.pack()

m.mainloop()