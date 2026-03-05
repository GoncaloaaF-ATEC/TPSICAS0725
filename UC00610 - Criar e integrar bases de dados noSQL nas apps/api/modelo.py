from pydantic import BaseModel


class Pessoa(BaseModel):
    nome: str
    idade: int


class Carro(BaseModel):
    nome: str
    idade: int


class Aluno(BaseModel):
    nome: str
    idade: int
