

from flask import Flask, request, render_template, jsonify
app = Flask(__name__)


in_memory_datastore = {
   "Macan": {"Model": "Macan", "Make": "Porsche"},
   "Land Cruiser": {"Model": "Land Cruiser", "Make": "Toyota"}
}

@app.route('/')
def hello_world():
    return render_template('index.html')

@app.route('/Car_Types', methods=['GET', 'POST'])
def Car_Types():
   if request.method == 'GET':
      return All_Car_Types()    
   elif request.method == 'POST':
      return Add_Car_Types(request.get_json(force=True))
   
def All_Car_Types():
   data = {
        'Model': 'Macan',
        'Make': 'Porsche',
    }
   return jsonify(data)

def Add_Car_Types(new_car):
    car = new_car['Model']
    in_memory_datastore[car] = new_car
    return new_car

if __name__ == '__main__':
   app.run()