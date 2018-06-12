le champs tauxRemuneration de la classe CompteBancaire doit être déplacé dans la classe LivetA.
La méthode debiterMontant doit être développer dans chaque classe avec uniquement les spécificité du débit lié à la classe.
Dans l'état actuel le type de compte ne sert plus.
Le constructeur de livretA prend des paramètres qui ne sont pas utile à l'objet comme le découvert.
Le constructeur de CompteBancaire doit être allégé suite à la perte de paramètre inutile.
la méthode appliquerRemuAnnuelle doit etre dans la classe LivretA vu qu'elle est la seul a en avoir besoin.