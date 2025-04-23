package collection.set.candidates;

import java.util.ArrayList;
import java.util.Iterator;

public class ManagerCandidates {
    private ArrayList<Candidate> candidates;
    public ManagerCandidates () {
        this.candidates = new ArrayList<Candidate>();
    }
    public ManagerCandidates(ArrayList<Candidate> al) {
        this.candidates = candidates;
    }

    public void addCandidate(Candidate candidate) {
        this.candidates.add(candidate);
    }
    public void showInformationCandidates() {
        for(Candidate candidate : candidates) {
            System.out.println(candidate + "\n");
        }
    }
    public void findCandidates(int newId) {
        for(Candidate candidate : candidates) {
            if(candidate.getId() == newId) {
                System.out.println(candidate  +"\n");
            }
        }
    }
}
