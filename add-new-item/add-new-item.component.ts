import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';
import { InventoryService } from '../inventory.service';

@Component({
  selector: 'app-add-new-item',
  templateUrl: './add-new-item.component.html',
  styleUrls: ['./add-new-item.component.css']
})
export class AddNewItemComponent implements OnInit {
product:Product=new Product();
  constructor(private inventory:InventoryService) { }

  ngOnInit(): void {
  }

  addItem()
  {
    this.inventory.addProduct(this.product).subscribe(product => this.product=product);
  }
  onSubmit()
  {
this.addItem();
  }

}
