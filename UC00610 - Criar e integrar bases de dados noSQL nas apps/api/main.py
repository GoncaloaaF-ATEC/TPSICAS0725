from fastapi import FastAPI

from modelo import Pessoa

app = FastAPI()

listaPessoas = []


# uvicorn main:app --reload   <--- run
@app.get("/")
async def root():
    return {"message": "Hello World"}


@app.get("/infos")
async def root():
    return {"message": "infos"}


@app.get("/infos/{name}")
async def say_hello(name: str):
    return {"message": f"infos do {name}"}


# ... ?page=12&limit=30å
@app.get("/infos2")
async def say_hello(page: int = 1, limit: int = 10):
    return {f"page": page, f"limit": limit}


# ... ?page=12&limit=30å
@app.get("/infos2/{name}")
async def say_hello(name: str, page: int = 1, limit: int = 10):
    return {"message 2": f"infos do {name}", f"page": page, f"limit": limit}


@app.get("/pessoas")
async def list_pessoa():
    return listaPessoas


@app.post("/pessoas")
async def create_pessoa(pessoa: Pessoa):
    listaPessoas.append(pessoa)
    return {"Criado": True, f"Pessoa": pessoa}
