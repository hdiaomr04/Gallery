import React from 'react'
import GalleryService from '../Service/GalleryService'

class MygalleryList extends React.Component{

    constructor(props){
        super(props)
        this.state={
            Mygallery:[]
        }
    }

    componentDidMount(){
        GalleryService.getMygallery().then((Response) =>{
            this.setState({ Mygallery: Response.data})
        });
    }
    
    render(){
        return (
            <div>
                <h1 className='text-center'>Mygallery List</h1>
                <link to ="/add-mygallery" className='btn btn-primary mb-2'>AddMygallery</link>
                <table className='table table-striped'>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Firstname</th>
                            <th>Lastname</th>
                            <th>Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                          this.state.Mygallery.map(
                            Mygallery =>
                            <tr  key={Mygallery.Id}>
                                <td>{Mygallery.Id}</td>
                                <td>{Mygallery.Firstname}</td>
                                <td>{Mygallery.Lastname}</td>
                                <td>{Mygallery.Email}</td>
                            </tr>
                          )  
                        }
                    </tbody>
        
                </table>
        
            </div>
          )
    }
}


export default MygalleryList