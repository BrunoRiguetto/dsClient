package com.devsuperior.dsclient.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ana", "000", 2300.00,"1994-07-20T10:30:00Z", 2));
		list.add(new Client(2L, "Bruno", "258.789.147-99", 5900.00,"1989-07-20T04:30:00Z", 1));
		return ResponseEntity.ok().body(list);
	}
}
