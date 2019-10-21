import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor() { }

  getEmployees() {
    return [
      { "id": 1, "name": "Edward", "age": 41 },
      { "id": 2, "name": "Jhon", "age": 36 },
      { "id": 3, "name": "Peter", "age": 55 },
      { "id": 4, "name": "Mary", "age": 22 },
      { "id": 5, "name": "Louis", "age": 23 }
    ];
  }
}
