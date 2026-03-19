# pip install pymongo <- basta
# pip install pymongo-stubs

import faker

fake = faker.Faker(locale="pt_PT")

from pymongo import MongoClient
from pymongo.collection import Collection

from Aluno import Aluno

# criar clt
clt = MongoClient('mongodb://root:rootpass@localhost:27017/')

# bases de dados existem
# print(clt.list_database_names())

# criar/aceder base dados
# db = clt.get_database('test')


db = clt['test']

# db = clt.get_database('test_2')

# db = clt['test_2']
# print(db.list_collection_names())

# listar as collections
# print(db.list_collection_names())

# aceder a uma Collection
# criar Collection
alunos: Collection = db['alunos']

# inserir dados

"""
alunos.insert_one({
    "nome": "Maria",
    "media": 18
})
"""

resposta = alunos.find({"media": {"$lte": 18}}, {"nome": 1, "_id": 0})

for aluno in resposta:
    print(aluno)

print("------")
"""

for i in range(10):
    alunos.insert_many([

        {
            "nome": fake.name(),
            "media": random.randint(1, 20)
        },
        {
            "nome": fake.name(),
            "media": random.randint(1, 20)
        }
    ])
    
"""

resposta = alunos.find({"media": {"$lte": 18}}, {"nome": 1, "media": 1, "_id": 0})

for aluno in resposta:
    print(aluno)
print("------")
# update

alunos.update_one({"nome": "Iara Ferreira"},
                  {"$set": {
                      "media": 10
                  }
                  })

# update alunos set media = 10 where nome = 'Iara Ferreira'

resposta = alunos.find({}, {"nome": 1, "media": 1, "_id": 0})

for aluno in resposta:
    print(aluno)

print("------")
print("------")

alunos.update_one({"nome": "Maria"},
                  {"$set": {
                      "media": 20
                  }
                  })

# update alunos set media = 10 where nome = 'Iara Ferreira'

for aluno in alunos.find({"nome": "Maria"}, {"nome": 1, "media": 1, "_id": 0}):
    print(aluno)

print("------")
print("------")

alunos.update_many({"nome": "Maria"},
                   {"$set": {
                       "media": 7
                   }
                   })

for aluno in alunos.find({"nome": "Maria"}, {"nome": 1, "media": 1, "_id": 0}):
    print(aluno)

# {$contains:{"username":"son"}}
print("------")
print("------")

for aluno in alunos.find({}, {"nome": 1, "media": 1, "_id": 0}):
    print(aluno)

# delete
print("------")
print("------")

alunos.delete_one({"nome": "Maria"})

for aluno in alunos.find({}, {"nome": 1, "media": 1, "_id": 0}):
    print(aluno)

alunos.delete_many({"nome": "Maria"})

for aluno in alunos.find({}, {"nome": 1, "media": 1, "_id": 0}):
    print(aluno)

# update 2


alunos.update_many({"media": {"$lt": 10}},
                   {"$set": {
                       "Estado": "Não Aprovado"
                   }
                   })

# dict -> obj
print("------")
print("------")
print("------")
print("------")
print("------")
print("------")

for aluno in alunos.find({}, {"nome": 1, "media": 1, "Estado": 1, "_id": 0}):
    print(aluno)

print("------")
print("------")
print("------")
print("------")

lista_alunos = []

resp = alunos.find()

for aluno in resp:
    al = Aluno()
    for k, v in aluno.items():
        setattr(al, k, v)
        lista_alunos.append(al)

for aluno in lista_alunos:
    print(getattr(aluno, "Estado", "Sem Estado"))
