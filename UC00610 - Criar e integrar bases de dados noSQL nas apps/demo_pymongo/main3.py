import re

from pymongo import MongoClient
from pymongo.collection import Collection

clt = MongoClient('mongodb://root:rootpass@localhost:27017/')

db = clt['test']

alunos: Collection = db['alunos']

resp = alunos.find({
    "nome": {
        "$regex": "ana",
        "$options": "i"
    }
}, {'_id': False, 'Estado': False})

resp = alunos.find({
    "nome": re.compile("^ana", re.IGNORECASE),
},
    {'_id': False, 'Estado': False})

resp = alunos.find({
    "nome": re.compile("es$", re.IGNORECASE),
},
    {'_id': False, 'Estado': False})

# filtro que mostre todos os nomes compostos por 2 nomes(so letras)
# onde o 1 nome começa por r
# o último termina com s


resp = alunos.find({
    "nome": re.compile("^r[a-z]+ [a-z]+s$", re.IGNORECASE),
},
    {'_id': False, 'Estado': False})

for aluno in resp:
    print(aluno)
