import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CaculatorComponent } from './caculator/caculator.component';
import {FormsModule} from "@angular/forms";
import { PickcolorComponent } from './pickcolor/pickcolor.component';
import { PetComponent } from './pet/pet.component';
import { FontsizeComponent } from './fontsize/fontsize.component';

@NgModule({
  declarations: [
    AppComponent,
    CaculatorComponent,
    PickcolorComponent,
    PetComponent,
    FontsizeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
