import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {BenhAn} from '../../model/benhAn';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  API_URL = 'http://localhost:3000/benh-an';

  constructor(private httpClient: HttpClient) {
  }

  getList(): Observable<BenhAn[]> {
    return this.httpClient.get<BenhAn[]>(this.API_URL);
  }

  findById(id: string): Observable<BenhAn> {
    return this.httpClient.get<BenhAn>(this.API_URL + '/' + id);
  }

  updateStudent(benhAn: BenhAn): Observable<void> {
    console.log(benhAn);
    return this.httpClient.patch<void>(this.API_URL + '/' + benhAn.id, benhAn);
  }

  deleteStudent(id: string): Observable<void> {
    return this.httpClient.delete<void>(this.API_URL + '/' + id);
  }

  // saveCustomer(customers: BenhAn): Observable<void> {
  //   console.log(customers);
  //   return this.httpClient.post<void>(this.API_URL, customers);
  // }
}
