from dataclasses import dataclass


@dataclass
class Aluno:
    nome: str = None  # por defeito não tem valor   None <=> Null
    idade: int = None  # por defeito não tem valor
    media: float = None  # por defeito não tem valor
