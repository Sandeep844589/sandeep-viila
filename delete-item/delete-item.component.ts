import { Component, OnInit } from '@angular/core';
import { Product } from '../Product';
import { InventoryService } from '../inventory.service';

@Component({
  selector: 'app-delete-item',
  templateUrl: './delete-item.component.html',
  styleUrls: ['./delete-item.component.css']
})
export class DeleteItemComponent implements OnInit {
productid:number;
  constructor(private deleteiteminventory:InventoryService) { }

  ngOnInit(): void {
    this.productid=0;
  }
  deleteItem()
  {
this.deleteiteminventory.deleteItems(this.productid).subscribe();
  }
  onSubmit()
  {
    this.deleteItem();
  }

}
