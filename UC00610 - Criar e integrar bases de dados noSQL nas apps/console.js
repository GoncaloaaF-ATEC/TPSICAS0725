show collections;

db.getCollection("alunos").drop()

db.createCollection("alunos");

db.alunos.insertOne({
    nome:"Joao",
    media:15.7
})

db.alunos.find();

db.alunos.insertOne({
    nome:"Maria",
    media:6
})

db.alunos.find();

db.alunos.insertOne({
    media:19,
    nome:"Ana"
})

db.alunos.find();


db.alunos.insertOne({
    media:19,
    nome:"Rita",
    idade:20
})

db.alunos.find();


db.alunos.insertMany([
{
    media:12,
    nome:"Julio",
    email:"julio@atec.pt"
},
 {
    media:15,
    nome:"Catarina",
    email:"catarina@atec.pt",
    morada: "morada x"
}
])

// 1 - mostra
// 0 - esconde
db.alunos.find({media:{$lt: 9}}, {nome: 1, _id: 0});


db.alunos.find()
db.alunos.find({media:{$gt: 10}});


db.alunos.find({
        media:{$gt: 10},
        idade: {$gte: 18}
});

db.alunos.find({
    $and: [
        {media:{$gt: 10}},
        {idade: {$gte: 18}}
    ]
});

db.alunos.find({email: { $exists: true }})


db.alunos.find({
    $or: [
        {media:{$gt: 10}},
        {idade: {$gte: 18}}
    ]
});



db.alunos.find({
    $or: [
        {media:{$gt: 10}},
        {idade: {$gte: 20}}
    ],
    email: {$exists: true}
});

// como obter uma lista com todos os alunos com idades entre 15 e 25?


db.alunos.find({
        idade:{$gte: 15},
        idade: {$lte: 25}
});



db.alunos.find({idade: {$gte: 20}}).sort({idade: -1}).limit(3)

//  Select * from alunos where idade >= 20  order by idade desc limit 3

db.alunos.find({idade: {$gte: 20}}).sort({idade: -1}).skip(2).limit(2)

// Select * from alunos where idade >= 20 order by idade desc limit 3 offset 2
db.turmas.insertOne({
    nome: "TPSIcas",
    ano: 2026,
    escola:"ATEC"
})

db.turmas.find()

db.createCollection("turma", {
    validator: {
        $jsonSchema:{
            required: ["nome", "codigo"]
        }
    }
})

db.turma.insertOne({nome:"TPSICas", codigo:"01"})

db.turma.insertOne({nome:null, codigo:null, outro_campo:""})





db.alunos.find({
        idade:{$gte: 15},
        idade: {$lte: 25}
});




db.alunos.insertOne({
     nome:"Joao Maria",
     media:15.7,
     morada:{
         rua:"Rua 1",
         apt:"apt 1",
     }
})


db.alunos.insertOne({
     nome:"Rita",
     media:15.7,
     morada:{
         rua:"Rua 1",
         apt:"apt 1",
     }
})



db.alunos.find({_id:ObjectId("69badd76f10a294f2dfb55c0")})



db.alunos2.insertOne({
    nome: "João Silva",
    turm: "12° A",
    notas: [
        {modulo: "Algoritmos", valor: 16},
        {modulo: "Bases de Dados", valor: 18}
    ],
    media_atual: 17
})


db.modulos.insertOne({
    nome:"noSQL",
    codigo: "UC00610"
})

db.modulos.find()

db.alunos2.insertOne({
    nome: "Carlos",
    modulo_id: ObjectId("69bae226f10a294f2dfb55c7")
})

db.alunos2.aggregate({
    $lookup:{
        from:"modulos",
        localField: "modulo_id",
        foreignField: "_id",
        as: "curso"
        }
    },
    {
        $project: {
            _id:0,
            nome:1,
            curso:1
        }
    }
 )

const modulo = db.modulos.insertOne({
    nome:"SQL",
    codigo: "UC00550"
})

db.alunos2.insertOne({
    nome: "Maria",
    modulo_id: modulo.insertedId
})

db.alunos2.insertOne({
    nome: "Pedro",
    modulo_id: modulo.insertedId
})

const modulo2 = db.modulos.findOne({
     codigo: "UC00610"
})

select * from modulos where codigo="UC00610"

db.alunos2.insertOne({
    nome: "Ana Maria",
    modulo_id: modulo2._id
})



db.alunos2.insertOne({
    nome: "Joana",
    turm: "12° A",
    notas: [
        {modulo: "Algoritmos", valor: 18},
        {modulo: "Bases de Dados", valor: 12}
    ],
    media_atual: 17
})


db.alunos2.insertMany([
{
    nome: "Joana",
    turm: "12° A",
    notas: [
        {modulo: "Algoritmos", valor: 18},
        {modulo: "Bases de Dados", valor: 12}
    ],
    media_atual: 17
},
    {
    nome: "Rui",
    turm: "12° A",
    notas: [
        {modulo: "Algoritmos", valor: 17},
        {modulo: "Bases de Dados", valor: 12}
    ],
    media_atual: 17
}

])


db.alunos2.find({
    notas:{
        $elemMatch: {
            valor: {$gt: 15}
        }
    }
})



