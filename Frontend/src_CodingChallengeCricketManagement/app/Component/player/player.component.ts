import { Component } from '@angular/core';
import { Player } from 'src/app/Model/player';
import { PlayerService } from 'src/app/player.service';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent {
  playerList: Player[] = [];

  constructor(private playerService: PlayerService ){ }
ngOnInit(){
  this.getAllPlayers();
}
  getAllPlayers(){
       this.playerService.getAll().subscribe(  
           (players) => {  this.playerList = players; 
                              console.log(players);} );
  }
  deletePlayer(id:number){

      this.playerService.deletePlayerByJerseyNumber(id).subscribe(()=>{ console.log('record deleted')});
      this.getAllPlayers();
  }
  
}
