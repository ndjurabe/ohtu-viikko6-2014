/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import javax.management.Query;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.PlaysIn;


public class QueryBuilder {
    Matcher query;
    
    public QueryBuilder(){
        query = new Matcher() {

            @Override
            public boolean matches(Player p) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
    }
    
    public Matcher query()
    {
        return query;
    }
    
    QueryBuilder playsIn(String team){
        this.query = new PlaysIn(team);
        return this;
        
    }
    QueryBuilder hasAtLeast(Integer number, String ofWhat){
        this.query = new HasAtLeast(number, ofWhat);
        return this;
        
    }
    QueryBuilder hasFewerThan(Integer number, String ofWhat){
        this.query = new HasFewerThan(number, ofWhat);
        return this;
        
    }
}
