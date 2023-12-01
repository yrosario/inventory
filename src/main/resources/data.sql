INSERT INTO os(id,name,manufacturer) VALUES(1000, "Windows 11", "Micrsoft");
INSERT INTO computer(sn,machine_name,purchased_date,warranty_date,os_id) VALUES ("cnfs89352","ws-test","2023-11-04","2024-11-03",1000); 
INSERT INTO floor(floor_number) VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13);
INSERT INTO building(id, name) VALUES (1, "Sargent"),(2,"Tremont"),(3,"Sawyer"),(4,"Samia");
INSERT INTO location(building_id, floor_number) VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,1),(2,2),(2,3),(2,4),(2,5),(2,6),
(2,7),(2,8),(2,9),(2,10),(2,11),(2,12),(2,13),(3,1),(3,2),(3,3),(3,4),(3,5),(3,6),(3,7),(3,8),(3,9),(3,10),(3,11),(3,12),(3,13);
INSERT INTO user(first_name,last_name,prefer_name,c_id,location_building_id,location_floor_number) VALUES ("Joe","Luna","Joseph",3223423,1,1);
INSERT INTO computer_owner(c_id, sn, id) VALUES(3223423,"cnfs89352", 10000);