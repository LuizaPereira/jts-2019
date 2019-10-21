import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title = 'Angular - Aulas';

  public name = "Luiza";

  public showTitle = false;

  public cars = ["BMW", "VOLVO", "FERRARI", "PORSCHE"];

}
