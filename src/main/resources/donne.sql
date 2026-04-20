create table collectivite (
                 id SERIAL PRIMARY KEY,
                 nom VARCHAR UNIQUE,
                 ville VARCHAR,
                 specialite VARCHAR,
                 date_creation DATE
             );

create table membre (
    id SERIAL PRIMARY KEY,
    nom VARCHAR,
    prenom VARCHAR,
    date_naissance DATE,
    genre VARCHAR,
    adresse TEXT,
    metier VARCHAR,
    telephone VARCHAR,
    email VARCHAR,
    date_adhesion DATE,
    collectivite_id INT,
    FOREIGN KEY (collectivite_id) REFERENCES collectivite(id)
    );

create table poste (
    id SERIAL PRIMARY KEY,
    nom VARCHAR
    );

create table mandat (
    id SERIAL PRIMARY KEY,
    annee INT,
    collectivite_id INT,
    FOREIGN KEY (collectivite_id) REFERENCES collectivite(id)
    );

create table membre_poste (
    id SERIAL PRIMARY KEY,
    membre_id INT,
    poste_id INT,
    mandat_id INT,
    FOREIGN KEY (membre_id) REFERENCES membre(id),
    FOREIGN KEY (poste_id) REFERENCES poste(id),
    FOREIGN KEY (mandat_id) REFERENCES mandat(id)
    );

create table cotisation (
                            id SERIAL PRIMARY KEY,
                            membre_id INT,
                            montant DECIMAL,
                            date_paiement DATE,
                            type VARCHAR,
                            mode_paiement VARCHAR,
                            FOREIGN KEY (membre_id) REFERENCES membre(id)
);

create table activite (
                          id SERIAL PRIMARY KEY,
                          nom VARCHAR,
                          date DATE,
                          obligatoire BOOLEAN,
                          collectivite_id INT,
                          FOREIGN KEY (collectivite_id) REFERENCES collectivite(id)
);

create table presence (
                          id SERIAL PRIMARY KEY,
                          membre_id INT,
                          activite_id INT,
                          statut VARCHAR, -- present, absent, excuse----
                          FOREIGN KEY (membre_id) REFERENCES membre(id),
                          FOREIGN KEY (activite_id) REFERENCES activite(id)
)