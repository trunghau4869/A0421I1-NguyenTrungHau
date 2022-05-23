import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Customer} from '../../model/Customer';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceFuramaService {

  API_URL = 'http://localhost:3000/customer';

  constructor(private httpClient: HttpClient) {
  }

  getList(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>(this.API_URL);
  }

  findById(id: number): Observable<Customer> {
    return this.httpClient.get<Customer>(this.API_URL + '/' + id);
  }

  updateStudent(customers: Customer): Observable<void> {
    console.log(customers);
    return this.httpClient.patch<void>(this.API_URL + '/' + customers.id, customers);
  }

  deleteStudent(id: string): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }
  saveCustomer(customers: Customer): Observable<void> {
    console.log(customers);
    return this.httpClient.post<void>(this.API_URL , customers);
  }
}
