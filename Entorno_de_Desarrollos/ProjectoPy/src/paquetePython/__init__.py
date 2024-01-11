import tkinter as tk

ventana = tk.Tk()
etiqueta = tk.Label(ventana, text="Hola Mundo")
etiqueta.pack(pady=ventana.winfo_screenheight()//4, padx=ventana.winfo_screenwidth()//4)

ventana.mainloop()
