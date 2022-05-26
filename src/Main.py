from datetime import datetime
import requests
import pprint

pp = pprint.PrettyPrinter(indent=4)

r = requests.get('https://www.farmer.pl/wykres/dane/zbozawykres/1/zbozawykres')

data=r.json()

xAxis = data['xAxis']
el = xAxis['categories']
dates=[]
names=[]
val_temp=[]
for i in el:
    dates.append(str(datetime.fromtimestamp(int(i/1000))))

values={}
for i, element in enumerate(data['series']):
    names.append(element['name'])
    for j, val in enumerate(element['data']):
        val_temp.append((dates[j],val))
    values.update({names[i]: val_temp})
    val_temp=[]

#print("{" + "\n".join("{!r}: {!r},".format(k, v) for k, v in values.items()) + "}")
pp.pprint(values)