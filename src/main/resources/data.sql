INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (1, 'Iron Man', 'Wounded, captured and forced to build a weapon by his enemies, billionaire industrialist...', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009368', 'http://i.annihil.us/u/prod/marvel/i/mg/9/c0/527bb7b37ff55');
INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (2, 'Thor', 'As the Norse God of thunder and lightning, Thor wields one of the greatest weapons ever made,...', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009664', 'http://i.annihil.us/u/prod/marvel/i/mg/d/d0/5269657a74350');
INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (3, 'Vision', 'The metal monstrosity called Ultron created the synthetic humanoid known as the Vision from...', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009697', 'http://i.annihil.us/u/prod/marvel/i/mg/9/d0/5111527040594');
INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (4, 'Black Panther', 'Thousands of years ago, five African tribes war over a meteorite containing the metal vibranium....', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009187', 'http://i.annihil.us/u/prod/marvel/i/mg/6/60/5261a80a67e7d');
INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (5, 'Black Widow', 'The first and best-known Black Widow is a Russian agent trained as a spy, martial artist, and sniper...', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009189', 'http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b');
INSERT INTO CHARACTERS (id, name, description, modified, resourceURI, thumbnail) VALUES (6, 'Spider-Man', 'Bitten by a radioactive spider, high school student Peter Parker gained the speed...', CURRENT_TIMESTAMP(), 'http://gateway.marvel.com/v1/public/characters/1009610', 'http://i.annihil.us/u/prod/marvel/i/mg/3/50/526548a343e4b');

INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (1, 'Wolverine Saga (2009)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');
INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (2, 'True Believers: Empyre - Vision (2020)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');
INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (3, 'Black Panther (2018)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');
INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (4, 'Marvel-Verse: Black Widow (Trade Paperback)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');
INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (5, 'Amazing Spider-Man (1999) #558 (Turner Variant)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');
INSERT INTO COMIC (id, title, description, modified, isbn, upc, ean, issn, format, resourceURI) VALUES (6, 'Thor Epic Collection: Into The Dark Nebula (Trade Paperback)', 'XYZ', CURRENT_TIMESTAMP(), 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ', 'XYZ');

INSERT INTO EVENT (id, title, description, resourceURI, modified)  VALUES (1, 'Amazing Spider-Man (1999) #558 (Turner Variant)', 'Loki sets about convincing the super-villains of Earth to attack heroes other than those...', 'http://gateway.marvel.com/v1/public/events/116', CURRENT_TIMESTAMP());
INSERT INTO EVENT (id, title, description, resourceURI, modified) VALUES (2, 'Age of Ultron', 'In a 10-issue event written by Brian Michael Bendis with art by Bryan Hitch...', 'http://gateway.marvel.com/v1/public/events/314', CURRENT_TIMESTAMP());
INSERT INTO EVENT (id, title, description, resourceURI, modified) VALUES (3, 'Atlantis Attacks', 'Ghaur returns to complete his quest to resurrect the evil god Set...', 'http://gateway.marvel.com/v1/public/events/233', CURRENT_TIMESTAMP());
INSERT INTO EVENT (id, title, description, resourceURI, modified) VALUES (4, 'Avengers Disassembled', 'riter Brian Michael Bendis kicks off his historic run with the Avengers by bringing...', 'http://gateway.marvel.com/v1/public/events/234', CURRENT_TIMESTAMP());

INSERT INTO SERIE (id, title, description, resourceURI, rating, modified) VALUES (1, 'A+X (2012 - 2014)', 'Get ready for action-packed stories featuring team-ups from your favorite Marvel...', 'http://gateway.marvel.com/v1/public/series/16450', 'Marvel Psr', CURRENT_TIMESTAMP());
INSERT INTO SERIE (id, title, description, resourceURI, rating, modified) VALUES (2, 'Alias Omnibus (2006)', 'Once upon a time, Jessica Jones was a costumed super-hero, just not a very good one....', 'http://gateway.marvel.com/v1/public/series/13383', 'Marvel Psr', CURRENT_TIMESTAMP());

INSERT INTO STORY (id, title, description, resourceURI, modified, thumbnail) VALUES (1, 'Fantastic Four (1998)', 'PIDER-SENSE PART 1 The FF have a lot to answer for in', 'http://gateway.marvel.com/v1/public/stories/912', CURRENT_TIMESTAMP(), 'http://i.annihil.us/u/prod/marvel/i/mg/f/30/50fecad1f395b');

INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (1, 6);
INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (2, 5);
INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (3, 4);
INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (4, 3);
INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (5, 2);
INSERT INTO CHARACTERS_COMIC(character_id, comic_id) values (6, 1);

INSERT INTO CHARACTERS_EVENT(CHARACTER_ID, EVENT_ID) VALUES (1, 2);
INSERT INTO CHARACTERS_EVENT(CHARACTER_ID, EVENT_ID) VALUES (6, 4);
INSERT INTO CHARACTERS_EVENT(CHARACTER_ID, EVENT_ID) VALUES (5, 1);
INSERT INTO CHARACTERS_EVENT(CHARACTER_ID, EVENT_ID) VALUES (4, 2);

INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (1, 1);
INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (2, 1);
INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (3, 1);
INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (5, 1);
INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (5, 1);
INSERT INTO CHARACTERS_STORY(CHARACTER_ID, STORY_ID) VALUES (6, 1);

INSERT INTO CHARACTERS_SERIE(CHARACTER_ID, SERIE_ID) VALUES (2, 1);
INSERT INTO CHARACTERS_SERIE(CHARACTER_ID, SERIE_ID) VALUES (6, 2);